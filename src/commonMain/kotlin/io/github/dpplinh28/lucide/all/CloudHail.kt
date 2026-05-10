package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudHail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 14.899f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CloudHailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudHail: ImageVector
    @Composable get() = CloudHailDefinition.asImageVector()
