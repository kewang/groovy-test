/**
 * Created by kewang on 2016/7/8.
 */
@Grab('commons-io:commons-io:2.4')

import org.apache.commons.io.FilenameUtils

def path = 'hello.txt'

println FilenameUtils.getName(path)
println FilenameUtils.getBaseName(path)
println FilenameUtils.getExtension(path)