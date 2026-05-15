package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ConciergeBell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 16f)
                arcToRelative(8f, 8f, 0f, true, false, -16f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ConciergeBellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ConciergeBell: ImageVector
    @Composable get() = ConciergeBellDefinition.asImageVector()
