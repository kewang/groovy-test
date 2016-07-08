/**
 * Created by kewang on 2016/7/8.
 */
class ListWithFilter extends ArrayList {
    Closure filter

    def leftShift(obj) {
        if (filter && filter(obj)) {
            add(obj)
        }
    }
}
