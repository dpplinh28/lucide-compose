package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cpu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 17f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 7f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 17f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 7f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.CpuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cpu: ImageVector
    @Composable get() = CpuDefinition.asImageVector()
