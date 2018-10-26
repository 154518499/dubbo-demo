package com.dubbo.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.dubbo.pojo.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by scp on 2018/10/20.
 */
@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserService {
    @GET
    @Path("queryAll")
    public List<User> queryAll();
}
