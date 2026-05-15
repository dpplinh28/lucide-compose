package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareLibrary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 7f)
                lineToRelative(2f, 10f)
            }
}

public val LucideIcons.All.SquareLibraryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareLibrary: ImageVector
    @Composable get() = SquareLibraryDefinition.asImageVector()
