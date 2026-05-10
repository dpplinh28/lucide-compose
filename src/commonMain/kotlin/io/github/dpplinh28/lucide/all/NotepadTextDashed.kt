package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotepadTextDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 8f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(5f)
            }
}

public val LucideIcons.All.NotepadTextDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotepadTextDashed: ImageVector
    @Composable get() = NotepadTextDashedDefinition.asImageVector()
