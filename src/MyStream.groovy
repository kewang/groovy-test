/**
 * Created by kewang on 2016/7/7.
 */
class MyStream {
    def open() { println 'open stream' }

    def close() { println 'close stream' }

    def read() { println 'read action' }

    def write(obj) { println "write action with ${obj}" }

    def exception() { throw new Exception('bad news') }
}
