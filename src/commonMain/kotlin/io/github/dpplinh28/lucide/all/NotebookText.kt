package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 6f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 8f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 12f)
                horizontalLineTo(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 16f)
                horizontalLineTo(14f)
            }
}

public val LucideIcons.All.NotebookTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookText: ImageVector
    @Composable get() = NotebookTextDefinition.asImageVector()
