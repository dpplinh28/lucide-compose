package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bitcoin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.767f, 19.089f)
                curveToRelative(4.924f, .868f, 6.14f, -6.025f, 1.216f, -6.894f)
                moveToRelative(-1.216f, 6.894f)
                lineTo(5.86f, 18.047f)
                moveToRelative(5.908f, 1.042f)
                lineToRelative(-.347f, 1.97f)
                moveToRelative(1.563f, -8.864f)
                curveToRelative(4.924f, .869f, 6.14f, -6.025f, 1.215f, -6.893f)
                moveToRelative(-1.215f, 6.893f)
                lineToRelative(-3.94f, -.694f)
                moveToRelative(5.155f, -6.2f)
                lineTo(8.29f, 4.26f)
                moveToRelative(5.908f, 1.042f)
                lineToRelative(.348f, -1.97f)
                moveTo(7.48f, 20.364f)
                lineToRelative(3.126f, -17.727f)
            }
}

public val LucideIcons.All.BitcoinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bitcoin: ImageVector
    @Composable get() = BitcoinDefinition.asImageVector()
