package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Laugh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 13f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 5f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -5f)
                horizontalLineToRelative(12f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(9.01f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(15.01f, 9f)
            }
}

public val LucideIcons.All.LaughDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Laugh: ImageVector
    @Composable get() = LaughDefinition.asImageVector()
