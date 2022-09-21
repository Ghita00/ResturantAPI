const express = require('express');
const app = express();
const path = require('path');
const router = express.Router();
const request = require('request');

router.get('/home',function(req,res){
  res.sendFile(path.join(__dirname+'/index.html'));
});

router.get('/', function(req, res){
  res.sendFile(path.join(__dirname+'/login.html'));
})

router.get('/test', function(req, res){
  request('http://www.google.com', function (error, response, body) {
    if (!error && response.statusCode === 200) {
      return res.redirect("http://localhost:3000/home");
    }
    return res.redirect("http://localhost:3000/");
  })
})

//add the router
app.use('/', router);
app.use(express.static(__dirname));
app.listen(process.env.port || 3000);

console.log('Running at Port 3000');