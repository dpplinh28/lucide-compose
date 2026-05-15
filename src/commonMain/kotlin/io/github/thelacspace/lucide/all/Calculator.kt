package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Calculator") { strokeWidth ->
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
                moveTo(8f, 6f)
                lineTo(16f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                lineTo(16f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CalculatorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Calculator: ImageVector
    @Composable get() = CalculatorDefinition.asImageVector()
