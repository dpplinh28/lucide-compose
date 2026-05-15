package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Regex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12.67f, 5.5f)
                lineToRelative(8.66f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12.67f, 10.5f)
                lineToRelative(8.66f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                close()
            }
}

public val LucideIcons.All.RegexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Regex: ImageVector
    @Composable get() = RegexDefinition.asImageVector()
