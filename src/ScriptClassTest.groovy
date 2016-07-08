/**
 * Created by kewang on 2016/7/8.
 */
def binding = new Binding()
def shell = new GroovyShell(binding)

binding.setVariable("x", 1)
binding.setVariable("y", 3)

shell.evaluate "z=2*x+y"

println binding.getVariable("z") == 5