package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBottomDashedScissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                lineTo(19f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                lineTo(3f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                lineTo(21f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                lineTo(10f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                lineTo(15f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56066f, 9.56066f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                lineTo(14.82f, 14.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56066f, 14.43934f)
                lineTo(17f, 7f)
            }
}

public val LucideIcons.All.SquareBottomDashedScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBottomDashedScissors: ImageVector
    @Composable get() = SquareBottomDashedScissorsDefinition.asImageVector()
