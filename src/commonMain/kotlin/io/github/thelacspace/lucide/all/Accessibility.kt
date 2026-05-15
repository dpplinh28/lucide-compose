package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Accessibility") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 19f)
                lineToRelative(1f, -7f)
                lineToRelative(-6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 8f)
                lineToRelative(3f, -3f)
                lineToRelative(5.5f, 3f)
                lineToRelative(-2.36f, 3.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.24f, 14.5f)
                arcToRelative(5f, 5f, 0f, false, false, 6.88f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.76f, 17.5f)
                arcToRelative(5f, 5f, 0f, false, false, -6.88f, -6f)
            }
}

public val LucideIcons.All.AccessibilityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Accessibility: ImageVector
    @Composable get() = AccessibilityDefinition.asImageVector()
