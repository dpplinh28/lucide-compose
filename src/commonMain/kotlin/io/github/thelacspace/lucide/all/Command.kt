package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Command") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, -3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, 3f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, true, false, -3f, 3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, true, false, -3f, -3f)
            }
}

public val LucideIcons.All.CommandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Command: ImageVector
    @Composable get() = CommandDefinition.asImageVector()
