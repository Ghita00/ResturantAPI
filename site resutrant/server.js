const express = require('express');
const app = express();
const path = require('path');
const router = express.Router();
const request = require('request');
const bp = require('body-parser')

//fix per req.body undefind
app.use(bp.json())
app.use(bp.urlencoded({ extended: true }))
//add the router
app.use('/', router);
app.use(express.static(__dirname));
app.listen(process.env.port || 3000);

//login
router.get('/', function(req, res){
  res.sendFile(path.join(__dirname+'/login.html'));
})

router.post('/', function(req, res){
  console.log(req.body["user"])
  request('http://localhost:8080/getList', function (error, response, body) {
    console.log(body)
    if (!error && response.statusCode === 200) {
      body = JSON.parse(body)
      body.forEach(element => {
        console.log(element)
        console.log(req.body["user"])
        if(element.username === req.body["user"]){
          console.log("qui")
          if(element.password === req.body["pass"]){
            console.log("qua")
            //TODO ERROR HEADER
            return res.redirect("http://localhost:3000/home/"+req.body["user"]);
          }
        }
      });
    }
    return res.redirect("http://localhost:3000/");
  })
})

//home
router.get('/home/:name',function(req,res){
  res.sendFile(path.join(__dirname+'/index.html'));
});

//ingredient
router.get("/newIngredient", function(req, res){
  res.sendFile(path.join(__dirname+'/newIngredient.html'));
})

//recipes
router.get("/newRecipes", function(req, res){
  res.sendFile(path.join(__dirname+'/newRecipes.html'));
})

console.log('Running at Port 3000');