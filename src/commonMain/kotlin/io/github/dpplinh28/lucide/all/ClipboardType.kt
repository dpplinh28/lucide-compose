package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardType") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, 1.0f, -1.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 11f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.ClipboardTypeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardType: ImageVector
    @Composable get() = ClipboardTypeDefinition.asImageVector()
