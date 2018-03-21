package com.ttn.linksharing

class UtilController {

    def index() {
        log.info 'from log info'
        log.warn 'from log warn'
        log.trace('Hello')

        //return index()

    }
}
