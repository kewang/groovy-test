/**
 * Created by kewang on 2016/7/7.
 */
class Hello {
    def hello = { who ->
        println "hello ${who}"
    }

    def square = { x ->
        x * x
    }

    def num

    def calc(Closure closure) {
        println(closure(num))
    }

    def calc(n, Closure closure) {
        println(closure(n))
    }

    def calc(n1, n2, Closure closure) {
        println(closure(n1, n2))
    }
}