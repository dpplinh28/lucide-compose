package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                horizontalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                horizontalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                horizontalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 22f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 8.5f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                verticalLineTo(8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 19.5f)
                verticalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(8f)
            }
}

public val LucideIcons.All.BookDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookDashed: ImageVector
    @Composable get() = BookDashedDefinition.asImageVector()
