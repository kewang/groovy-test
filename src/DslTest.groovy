/**
 * Created by kewang on 2016/7/8.
 */
show = {
    println it
}

square_root = {
    Math.sqrt(it)
}

def please(action) {
    [the: { what ->
        [of: { n ->
            action(what(n))
        }]
    }]
}

please show the square_root of 100