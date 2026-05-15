package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 20f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                horizontalLineToRelative(20f)
            }
}

public val LucideIcons.All.DoorClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosed: ImageVector
    @Composable get() = DoorClosedDefinition.asImageVector()
