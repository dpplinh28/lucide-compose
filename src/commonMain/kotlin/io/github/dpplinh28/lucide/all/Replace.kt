package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Replace") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 7f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.ReplaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Replace: ImageVector
    @Composable get() = ReplaceDefinition.asImageVector()
