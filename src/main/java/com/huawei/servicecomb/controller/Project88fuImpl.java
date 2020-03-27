package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-03-27T04:07:44.482Z")

@RestSchema(schemaId = "project88fu")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project88fuImpl {

    @Autowired
    private Project88fuDelegate userProject88fuDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject88fuDelegate.helloworld(name);
    }

}
