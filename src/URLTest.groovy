/**
 * Created by kewang on 2016/7/8.
 */
new URL("http://www.codedata.com.tw/").eachLine { line ->
    if (line.trim().startsWith("<h2>")) {
        println line.trim()
    }
}

def result = new URL("http://ifconfig.me/all").text

def props = [:]

result.split('\n').each {
    def token = it.split(':')
    def key = token[0].trim()
    def value = token[1].trim()

    props[key] = value
}

println props.user_agent

def url = "https://www.google.com/images/logo.png"

URL.metaClass.downloadTo = {
    it.withOutputStream {
        it << delegate.openStream()
    }
}

new URL(url).downloadTo(new File("/tmp/logo.png"))