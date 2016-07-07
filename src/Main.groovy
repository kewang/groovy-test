/**
 * Created by kewang on 2016/7/7.
 */
class Main {
    public static void main(String[] args) {
        def mc1 = new Hello(num: 5)

        mc1.calc { x ->
            x * x
        }

        mc1.calc(3) { x ->
            x * x
        }

        mc1.calc(4, 5) { x, y ->
            x - y
        }

        def file1 = new File("output.log")

        file1.text = "hello\nworld\n"

        new File("output.log").eachLine { line ->
            println line
        }

        def file2 = new File("output.log")

        file2.withWriter {
            println it.class.name
            println it instanceof BufferedWriter
            println it instanceof Writer
        }

        file2.withWriter { writer ->
            (1..10).each {
                writer << "${it}\n"
            }
        }

        new File("output.log").eachLine { line ->
            println line
        }

        def stats = new File('stats.log')

        stats.withWriter {
            println it.class.name
            println it instanceof BufferedWriter
            println it instanceof Writer
        }

        stats.withWriter { writer ->
            (1..10).each {
                writer << "${it}\n"
            }
        }

        def processors = []

        processors << { line ->
            println Math.sqrt(line.toInteger())
        }

        processors << { line ->
            println Math.pow(line.toInteger(), 2).toLong()
        }

        processors.each {
            stats.eachLine it
        }

        def use = { MyStream stream, Closure closure ->
            try {
                stream.open()
                closure(stream)
            } catch (e) {
                println e.message
            } finally {
                stream.close()
            }
        }

        def stream1 = new MyStream()

        use(stream1) {
            it.read()
            it.write(new Object())
            it.exception()
        }
    }
}