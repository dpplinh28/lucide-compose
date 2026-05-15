package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Haze") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(5.2f, 6.2f)
                lineToRelative(1.4f, 1.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.4f, 7.6f)
                lineToRelative(1.4f, -1.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 21f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineTo(2.5f)
            }
}

public val LucideIcons.All.HazeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Haze: ImageVector
    @Composable get() = HazeDefinition.asImageVector()
