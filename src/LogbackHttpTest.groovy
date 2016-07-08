/**
 * Created by kewang on 2016/7/8.
 */
def GET(String url, Closure closure) {
    headers = [:]

    println url

    closure(headers)

    println headers
}


GET("https://www.google.com.tw") {
    headers["ui"] = "123456"
    headers["at"] = "789012"
}