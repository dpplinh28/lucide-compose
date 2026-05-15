package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 16f)
                verticalLineToRelative(5.286f)
                arcToRelative(.71f, .71f, 0f, false, false, 1.212f, .502f)
                lineToRelative(1.149f, -1.149f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.MessageSquareDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareDashed: ImageVector
    @Composable get() = MessageSquareDashedDefinition.asImageVector()
