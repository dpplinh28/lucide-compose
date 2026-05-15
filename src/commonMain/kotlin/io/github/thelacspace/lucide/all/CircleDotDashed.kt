package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDotDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f, 2.18f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 3.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.6f, 3.71f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, 2.69f, 2.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.82f, 10.1f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 0f, 3.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.29f, 17.6f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, -2.7f, 2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f, 21.82f)
                arcToRelative(9.94f, 9.94f, 0f, false, true, -3.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.4f, 20.29f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, -2.69f, -2.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.18f, 13.9f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 0f, -3.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.71f, 6.4f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, 2.7f, -2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.CircleDotDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDotDashed: ImageVector
    @Composable get() = CircleDotDashedDefinition.asImageVector()
