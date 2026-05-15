package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Loader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.2f, 7.8f)
                lineToRelative(2.9f, -2.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.2f, 16.2f)
                lineToRelative(2.9f, 2.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.9f, 19.1f)
                lineToRelative(2.9f, -2.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.9f, 4.9f)
                lineToRelative(2.9f, 2.9f)
            }
}

public val LucideIcons.All.LoaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Loader: ImageVector
    @Composable get() = LoaderDefinition.asImageVector()
