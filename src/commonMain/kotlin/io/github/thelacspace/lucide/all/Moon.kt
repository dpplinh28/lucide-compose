package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Moon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.985f, 12.486f)
                arcToRelative(9f, 9f, 0f, true, true, -9.473f, -9.472f)
                curveToRelative(.405f, -.022f, .617f, .46f, .402f, .803f)
                arcToRelative(6f, 6f, 0f, false, false, 8.268f, 8.268f)
                curveToRelative(.344f, -.215f, .825f, -.004f, .803f, .401f)
            }
}

public val LucideIcons.All.MoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Moon: ImageVector
    @Composable get() = MoonDefinition.asImageVector()
