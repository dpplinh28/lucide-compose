package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrainCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.852f, 14.772f)
                lineToRelative(-.383f, .923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(10.852f, 9.228f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.148f, 14.772f)
                lineToRelative(.382f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.531f, 8.305f)
                lineToRelative(-.383f, .923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 10.852f)
                lineToRelative(.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 13.148f)
                lineToRelative(.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.598f, 6.5f)
                arcTo(3f, 3f, 0f, true, false, 12f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -5.63f, -1.446f)
                arcToRelative(3f, 3f, 0f, false, false, -.368f, 1.571f)
                arcToRelative(4f, 4f, 0f, false, false, -2.525f, 5.771f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.998f, 5.125f)
                arcToRelative(4f, 4f, 0f, false, true, 2.525f, 5.771f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.505f, 10.294f)
                arcToRelative(4f, 4f, 0f, false, true, -1.5f, 7.706f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.032f, 17.483f)
                arcTo(4f, 4f, 0f, false, false, 11.464f, 20f)
                curveToRelative(.18f, -.311f, .892f, -.311f, 1.072f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, 7.432f, -2.516f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 10.291f)
                arcTo(4f, 4f, 0f, false, false, 6f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.002f, 5.125f)
                arcToRelative(3f, 3f, 0f, false, false, .4f, 1.375f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 10.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 13.148f)
                lineToRelative(-.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.BrainCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrainCog: ImageVector
    @Composable get() = BrainCogDefinition.asImageVector()
