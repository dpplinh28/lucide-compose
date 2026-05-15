package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookTabs") { strokeWidth ->
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
                moveTo(15f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 7f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 17f)
                horizontalLineToRelative(5f)
            }
}

public val LucideIcons.All.NotebookTabsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookTabs: ImageVector
    @Composable get() = NotebookTabsDefinition.asImageVector()
