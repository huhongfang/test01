package com.service.sdzess.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-12T06:18:58.302Z")

@RestSchema(schemaId = "sdzess")
@RequestMapping(path = "/sdzess", produces = MediaType.APPLICATION_JSON)
public class SdzessImpl {

    @Autowired
    private SdzessDelegate userSdzessDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSdzessDelegate.helloworld(name);
    }

}
