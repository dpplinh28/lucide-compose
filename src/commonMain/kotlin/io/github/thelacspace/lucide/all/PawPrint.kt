package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PawPrint") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.84f, 1.045f)
                quadTo(6.52f, 17.48f, 4.46f, 16.84f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.5f, 10f)
                close()
            }
}

public val LucideIcons.All.PawPrintDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PawPrint: ImageVector
    @Composable get() = PawPrintDefinition.asImageVector()
