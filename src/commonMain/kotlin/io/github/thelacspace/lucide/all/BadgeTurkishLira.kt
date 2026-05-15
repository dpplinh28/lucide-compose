package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BadgeTurkishLira") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                verticalLineToRelative(10f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 8f)
                lineToRelative(-6f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
            }
}

public val LucideIcons.All.BadgeTurkishLiraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BadgeTurkishLira: ImageVector
    @Composable get() = BadgeTurkishLiraDefinition.asImageVector()
