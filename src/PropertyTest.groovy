import groovy.time.TimeCategory

/**
 * Created by kewang on 2016/7/8.
 */
use(TimeCategory) {
    println 1.minute.from.now
    println 10.hours.ago

    def someDate = new Date()

    println someDate - 3.months
}