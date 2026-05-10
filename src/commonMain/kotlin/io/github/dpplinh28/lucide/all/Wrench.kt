package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wrench") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.7f, 6.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.4f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.4f, 0f)
                lineToRelative(3.106f, -3.105f)
                curveToRelative(.32f, -.322f, .863f, -.22f, .983f, .218f)
                arcToRelative(6f, 6f, 0f, false, true, -8.259f, 7.057f)
                lineToRelative(-7.91f, 7.91f)
                arcToRelative(1f, 1f, 0f, false, true, -2.999f, -3f)
                lineToRelative(7.91f, -7.91f)
                arcToRelative(6f, 6f, 0f, false, true, 7.057f, -8.259f)
                curveToRelative(.438f, .12f, .54f, .662f, .219f, .984f)
                close()
            }
}

public val LucideIcons.All.WrenchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wrench: ImageVector
    @Composable get() = WrenchDefinition.asImageVector()
