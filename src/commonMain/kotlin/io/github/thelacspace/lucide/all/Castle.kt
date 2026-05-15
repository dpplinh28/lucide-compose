package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Castle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 3f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 11f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.CastleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Castle: ImageVector
    @Composable get() = CastleDefinition.asImageVector()
