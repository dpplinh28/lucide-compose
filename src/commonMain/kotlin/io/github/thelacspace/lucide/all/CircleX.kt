package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 9f)
                lineToRelative(6f, 6f)
            }
}

public val LucideIcons.All.CircleXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleX: ImageVector
    @Composable get() = CircleXDefinition.asImageVector()
