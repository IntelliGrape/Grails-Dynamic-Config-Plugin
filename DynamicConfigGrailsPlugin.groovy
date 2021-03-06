import org.grails.plugins.dynamicConfig.ConfigProperty

class DynamicConfigGrailsPlugin {
    // the plugin version
    def version = "0.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Aman Aggarwal / Abhishek Tejpaul"
    def authorEmail = "aman@intelligrape.com / abhishek@intelligrape.com"
    def title = "Dynamic-Config-Plugin"
    def description = '''
This plugin is created using Grails 1.3.4 and gives your application the ability to dynamically change the config properties as defined in Config.groovy.
This plugin is useful in situations where you need to make run-time changes in the behavior of your application through config properties.
The documentation of the plugin can be found here: [http://github.com/IntelliGrape/Grails-Dynamic-Config-Plugin/wiki]
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/dynamic-config"

    def doWithWebDescriptor = {xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = {ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = {applicationContext ->
       // TODO Implement post initialization spring config (optional)
    }
    
    def onChange = {event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = {event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
