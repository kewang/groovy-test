/**
 * Created by kewang on 2016/7/8.
 */
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
@Grab('commons-beanutils:commons-beanutils:1.9.1')
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

def http = new HTTPBuilder("https://ifconfig.co/")

http.ignoreSSLIssues()

http.request(GET) { req ->
    response.success = { resp, content ->
        println resp.headers["Content-Type"]
        println content
    }
}

http = new HTTPBuilder('http://google.com/error')

http.request(GET) { req ->
    response.success = { resp, content ->
        println resp.headers.'Content-Type'
        println content
    }
    response.'404' = { resp ->
        println "Error Code = ${resp.status}"
    }
}