package com.example.demo.Service;

import com.example.demo.Repository.UserTableRepoRead;
import com.example.demo.Table.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@Service
public class UserTableService {
    private final UserTableRepoRead userTableRepoRead;

    @Autowired
    public UserTableService(UserTableRepoRead userTableRepoRead) {
        this.userTableRepoRead = userTableRepoRead;
    }

    @GetMapping("/getList")
    @CrossOrigin(origins = "http://localhost:3000")
    Collection<UserTable> findService(){
        Collection<UserTable> r = userTableRepoRead.findAllActiveUsers();
        r.add(new UserTable(1, "giorgio", "basile", null));
        r.add(new UserTable(2, "marco", "rossi", null));
        return r;
    }
}

