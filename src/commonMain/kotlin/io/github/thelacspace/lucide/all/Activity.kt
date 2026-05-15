package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Activity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-2.48f)
                arcToRelative(2f, 2f, 0f, false, false, -1.93f, 1.46f)
                lineToRelative(-2.35f, 8.36f)
                arcToRelative(.25f, .25f, 0f, false, true, -.48f, 0f)
                lineTo(9.24f, 2.18f)
                arcToRelative(.25f, .25f, 0f, false, false, -.48f, 0f)
                lineToRelative(-2.35f, 8.36f)
                arcTo(2f, 2f, 0f, false, true, 4.49f, 12f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.ActivityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Activity: ImageVector
    @Composable get() = ActivityDefinition.asImageVector()
