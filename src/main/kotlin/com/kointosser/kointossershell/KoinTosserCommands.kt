package com.kointosser.kointossershell

import com.kointosser.kointosser.KoinTosser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@ShellComponent
class KoinTosserCommands {

  private lateinit var koinTosser: KoinTosser

  @Autowired
  fun koinTosserService(koinTosser: KoinTosser) {
    this.koinTosser = koinTosser
  }

  @ShellMethod("Toss a coin")
  fun toss(): String {
    return koinTosser.toss().name.toUpperCase()
  }

}