package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, .4f, -.8f)
                arcTo(6f, 6f, 0f, false, true, 8f, 2f)
                curveToRelative(3f, 0f, 5f, 2f, 7.333f, 2f)
                quadToRelative(2f, 0f, 3.067f, -.8f)
                arcTo(1f, 1f, 0f, false, true, 20f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -.4f, .8f)
                arcTo(6f, 6f, 0f, false, true, 16f, 16f)
                curveToRelative(-3f, 0f, -5f, -2f, -8f, -2f)
                arcToRelative(6f, 6f, 0f, false, false, -4f, 1.528f)
            }
}

public val LucideIcons.All.FlagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flag: ImageVector
    @Composable get() = FlagDefinition.asImageVector()
