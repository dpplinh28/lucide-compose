package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 12f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(11f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .5f)
                arcTo(6.5f, 6.5f, 0f, false, false, 22f, 9.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, -.5f)
                horizontalLineToRelative(-1.672f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -.586f)
                lineToRelative(-5.062f, -5.062f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineTo(9.352f, 5.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(5.062f, 5.062f)
                arcTo(2f, 2f, 0f, false, true, 15f, 13.828f)
                close()
            }
}

public val LucideIcons.All.AxeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axe: ImageVector
    @Composable get() = AxeDefinition.asImageVector()
