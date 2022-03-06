package org.ageseries.lamc

import net.minecraftforge.fml.common.Mod
import org.ageseries.lamc.LibageMinecraft.MODID
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

val LOGGER: Logger = LogManager.getLogger()

@Mod(MODID)
object LibageMinecraft {
    const val MODID = "libage_minecraft"

    init {
        LOGGER.info("Libage has been loaded")
    }
}
