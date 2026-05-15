package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Megaphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 6f)
                arcToRelative(13f, 13f, 0f, false, false, 8.4f, -2.8f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, .8f)
                arcTo(13f, 13f, 0f, false, false, 11f, 14f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                arcToRelative(12f, 12f, 0f, false, false, 2.4f, 7.2f)
                arcToRelative(2f, 2f, 0f, false, false, 3.2f, -2.4f)
                arcTo(8f, 8f, 0f, false, true, 10f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 6f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.MegaphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Megaphone: ImageVector
    @Composable get() = MegaphoneDefinition.asImageVector()
