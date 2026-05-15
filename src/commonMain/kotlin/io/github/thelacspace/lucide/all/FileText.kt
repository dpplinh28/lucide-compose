package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 22f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.704f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineTo(8f)
            }
}

public val LucideIcons.All.FileTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileText: ImageVector
    @Composable get() = FileTextDefinition.asImageVector()
